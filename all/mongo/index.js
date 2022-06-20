var MongoClient = require("mongodb").MongoClient;
var url = "mongodb://localhost:27017/";

MongoClient.connect(url, function(err, db) {
    if (err) throw err;
    console.log("database connected.");
    var database = db.db("student");
    var newS = [
        { name: 'Ayush', age: '21' },
        { name: 'samir', age: '20' },
        { name: 'arandeep', age: '20' }

    ];

    database.collection("student").insertMany(newS, function(err, res) {
        if (err) throw err;
    });

    var query = {
        name: /^s/
    };
    database.collection("student").find(query)
        .toArray(function(err, res) {
            if (err) throw err;
            console.log(res);
        });

    database.collection('student').updateMany({ name: 'samir' }, { $set: { name: 'Abhaya', age: '10' } }, function(err2, re) {
        if (err2) {
            console.log('Error in updating');
            throw err2;
        }

        console.log("updated!")
        db.close();
        
    });
    database.collection('student').deleteMany({name: 'Ayush'},function(e,etr){
        if (e) throw e
        console.log('Deleted Records')
    });
 });