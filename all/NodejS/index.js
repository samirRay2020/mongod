//Example 1: Run in console using the command node App.js
//console.log("Hello World");

//Example 2: Run in console using the command node App.js
/*var a=5
var b=3
console.log("The output is c =", a+b)*/


//Example 3: Run in console using the command node App.js. Open the browser and see localhost:3000. Welcome message will be displayed
/*var http = require("http")
http.createServer(function(req,res){
	res.writeHead(200,{"Content-Type":"text/html"})
	res.write("Welcome to the world of NodeJS")
//	res.end("Welcome to NodeJS") 
	res.end()
}).listen(8080)*/

//Example 4: Adding numbers in a function. But where are the modules here?
/*function add(a,b)
{ 
return a+b
}

result = add(4,5)
console.log("The result is "+result)*/

//Example 5: Creating Modules in Node JS.
/*var calc = require("./Calc.js")

addresult = calc.add(4,5)
console.log("The addition output is " +addresult)

subresult = calc.sub(4,5)
console.log("The subtraction output is " +subresult)*/

//Example 6: Reading a file and displaying the same in the console
/*var fd = require('fs')
fd.readFile('Calc.js','utf8', function(err,data)
{
console.log(data)
})*/


//Example 7: Writing to a file.
//var fs = require('fs')
//parameters of writeFile are: file in which the content has to be written, content, callback function
/*fs.writeFile('Calc1.js', 'console.log("done")',function(err)  
{
console.log("Data Saved")
}
)*/
//What will happen if you write the content in the alredy existing file?
//Will it write the new content at the end or in the beginning or will replace?

//Example 8: Writing the url

/*var http = require('http');
http.createServer(function (req, res) {
  res.writeHead(200, {'Content-Type': 'text/html'});
  res.write(req.url);
console.log(req.url);
  res.end();
}).listen(8080);*/

//Example 9:
/*var http = require('http');
var url = require('url');

http.createServer(function (req, res) {
  res.writeHead(200, {'Content-Type': 'text/html'});
  var q = url.parse(req.url, true).query;
  var txt = q.year + " " + q.month;
  res.end(txt);
}).listen(8080);*/

//Example 10: 
//var fs = require('fs');

//create a file named mynewfile1.txt:
/*fs.appendFile('Calc1.js', '\nHello content!', function (err) {
  if (err) throw err;
  console.log('Saved!');
});*/

//Example 11:
/*var fs = require('fs');

fs.rename('Calc1.js', 'Calc2.js', function (err) {
  if (err) throw err;
  console.log('File Renamed!');
});
*/

//Example 12:

/*var fs = require('fs');

fs.unlink('Calc2.js', function (err) {
  if (err) throw err;
  console.log('File deleted!');
});*/

//Example 13:
