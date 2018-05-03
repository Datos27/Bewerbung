var fs = require('fs');
const chalk = require('chalk');
var in_objekt
var in_string

var __dirname = 'C:/Users/Admin/Desktop/GitHub/JS';
fs.readFile(__dirname+"/staedte.json", function(err, data){

    in_string = data.toString();

    in_objekt = JSON.parse(in_string);
    
    for (var i = 0; i < in_objekt.cities.length; i++){
        console.log(chalk.red('name       : ')+in_objekt.cities[i].name);
        console.log(chalk.yellow('country    : ')+in_objekt.cities[i].country);
        console.log(chalk.blue('population : ')+in_objekt.cities[i].population);
        console.log('-------------------------------');
    }

});