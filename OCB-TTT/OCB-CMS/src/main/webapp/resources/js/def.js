/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var def =new function() {

    var mod = {}; // cache, name -> dfd

    var noop = {resolve: $.noop};

    var ns = {}; // what are the names in use


    
    $(function() { // safe guard against the unresolvables

        var count = 0;

        var id = setInterval(function() {

            

            if (++count > 3) {

                console.warn('there are still some unresolved dependencies after 3 retries');

                clearInterval(id);

                return;

            }



            var fail = 0;

            $.each(mod, function(k, v) {

                if (v.state() === 'pending') {

                    console.log(k + ' is not resolved, upon page load');

                    fail += 1;

                }

            });



            if (fail === 0) {

                console.log('def.done');

                clearInterval(id);

            }

        }, 3000);

    });



    function depend(name) {

        if (!name) {

            return noop;

        } else if (!mod[name]) {

            mod[name] = $.Deferred();

        }

        return mod[name];

    }



    function construct(dfd, dependencies, fn) {

        $.when.apply(null, $.map(dependencies, depend)).done(function() {

            dfd.resolve(fn.apply(null, arguments));

        });

    }



    function print(name, dependencies) {

        name = name || '*anonymous*';

        console.log(name + " -> [" + dependencies + "]");

    }



    function checkUnique(name) {

        if (!name) {

            return;

        }



        if (ns[name]) {

            console.warn(name + ' is already in use');

        } else {

            ns[name] = true;

        }

    }



    return function(name) {



        checkUnique(name);



        var dfd = depend(name);

        var dependencies = [];



        var result = {

            using: function() {

                dependencies = $.map(arguments, function(v) {

                    return v;

                });

                return result;

            },

            as: function(obj) {

                print(name, dependencies);

                construct(dfd, dependencies, function() {

                    return obj;

                });

            },

            by: function(fn) {

                print(name, dependencies);

                construct(dfd, dependencies, fn);

            }

        };
        return result;

    };
    };
    
