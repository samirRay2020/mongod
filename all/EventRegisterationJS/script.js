function blurfunc(val){
  document.getElementById(val).style.backgroundColor="silver";
}
function focusfunc(val){
  document.getElementById(val).style.backgroundColor="yellow";
}
function startTime(){
  const today = new Date();
  let h = today.getHours();
  let m = today.getMinutes();
  let s = today.getSeconds();
  m = checkTime(m);
  s = checkTime(s);
  document.getElementById('txt').innerHTML =  h + ":" + m + ":" + s;
  setTimeout(startTime, 1000);
}

function checkTime(i) {
  if (i < 10) {i = "0" + i}; 
  return i;
}

function changefunc(){
var x = document.getElementById("dept").value;
alert("You selected: " + x);
}

var removables=[];
function allowDrop(ev) {
  ev.preventDefault();
}

function drag(ev) {
  ev.dataTransfer.setData("text", ev.target.innerHTML);
  removables.push(ev.target);
}

function drop(ev) {
  ev.preventDefault();
  var data = ev.dataTransfer.getData("text");
  ev.target.value+=(data+",");
  for (let i = 0; i < removables.length; i++) {
		removables[i].remove()
	}
}