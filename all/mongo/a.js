/*
Steps:
1. npm init
2. npm install mongodb
3. create .js file
4. node file_name.js
*/
const MongoClient =  require('mongodb').MongoClient;

MongoClient.connect("mongodb://localhost:27017/",function(err,res){
	console.log("Database connected");
	const db=res.db("Users");
	/* commands to be written here */
})

/*
To print all the records
db.collection("login").find({}).toArray(function(err,res){
	console.log(res)
});

To print records in sorted order
const q={username:-1}
	db.collection("login").find({}).sort(q).toArray(function(err1,res1){
		console.log(res1);
	})

To insert a record
const data={username:"pand",password:"4383"}
db.collection("login").insertOne(data,function(err,res){
	console.log("inserted")
});

To insert many records
const arr=[{username:"pand",password:"4383"},{username:"pandi",password:"43hhb83"}]
db.collection("login").insertMany(arr,function(err,res){
	console.log("inserted")
});

To update
const q={username:"pandi"} //record which needs to be changed
const new_val={$set:{password:"443647364"}}
db.collection("login").updateOne(q,new_val,function(err,res){
	console.log("updated")
});

To delete a record
const q={username:"pandi"}
db.collection("login").deleteOne(q,function(err,res){
	console.log("updated")
});

To find a particular record
const q={username:"pandey"}
db.collection("login").findOne(q,function(err,res){
	console.log(res.password)
	console.log(res)
});

To select particular columns
const q={_id:0,password:0} //set all the columns to 0 which need not to be extracted 
db.collection("login").find({}).project(q).toArray(function(err,res){
	console.log(res)
});
*/