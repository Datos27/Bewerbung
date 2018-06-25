var fs = require('fs');

var buch = ('Der Herr der Ringe');
var stort = ('Koeln');

var in_objekt;
var in_string;

var __dirname = 'C:/Users/Admin/Desktop/WBA2/Projekt';


fs.readFile(__dirname+"/person.json", function(err, data){
    in_string = data.toString();

    in_objekt = JSON.parse(in_string);

    var g = 0;
    var match;
    for(var i = 0; i < in_objekt.person.length; i++){
        for(var h = 0; h < in_objekt.person[i].wunschbuch.length; h++){  
            if(in_objekt.person[i].wunschbuch[h] == buch){
                //console.log('true'+h);
                console.log('name               : '+in_objekt.person[i].name);
                console.log('standort           : '+in_objekt.person[i].standort);
                console.log('e-mail             : '+in_objekt.person[i].mail);
                console.log('\n');
                for(var h = 0; h < in_objekt.person[i].buchinbesitz.length; h++){
                    console.log('buch in besitz     : '+in_objekt.person[i].buchinbesitz[h]);
                }
                console.log('\n');
                for(var g = 0; g < in_objekt.person[i].wunschbuch.length; g++){
                    console.log('wunschbuch         : '+in_objekt.person[i].wunschbuch[g]);
                }        
                console.log('-------------------------------');
                
            }
        }
    }
    
    /*for (var i = 0; i < in_objekt.person.length; i++){
        console.log('name               : '+in_objekt.person[i].name);
        console.log('standort           : '+in_objekt.person[i].standort);
        console.log('e-mail             : '+in_objekt.person[i].mail);
        console.log('\n');
        for(var h = 0; h < in_objekt.person[i].buchinbesitz.length; h++){
            console.log('buch in besitz     : '+in_objekt.person[i].buchinbesitz[h]);
        }
        console.log('\n');
        for(var g = 0; g < in_objekt.person[i].wunschbuch.length; g++){
            console.log('wunschbuch         : '+in_objekt.person[i].wunschbuch[g]);
        }        
        console.log('-------------------------------');
    }*/

});