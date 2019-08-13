//variables /datatypes

'use strict'
 var x=10;
var y=10.5
var z="Hello"
var isBreak=false
var noval;
var someVal=null
var obj={} //this is an object,empty object Shorthand notation of creating an object
console.log(obj + 'type is'+ typeof obj) 


console.log(x)
console.log(typeof x)

console.log('Value of x is ' + x +' and type of x is '+ typeof x)
console.log('Value of y is' + y +' and type of y is '+ typeof y)
console.log('Value of z is ' + z +' and type of z is '+ typeof z)
console.log('Value of isBreak is ' + isBreak +' and type of isBreak is '+ typeof isBreak)
console.log('Value of someVal ' + someVal +' and type of someVal is '+ typeof someVal)
console.log('Value of noval ' + noval +' and type of noval is '+ typeof noval)
console.log('Value of null ' + null +' and type of null is '+ typeof null)

var person={
    name:'Pallavi',
    age:22,
    isEmployed:true
}

console.log(person)


var x1={}   //object

var per={
    name:'Pallavi',  //values of two object can be equal
    age:22,
    
}
console.log(per.name===person.name)

console.log(x1===obj)  //two objects are never equal




//long hand notation of creating objects


var newObj = new Object();
console.log(newObj)

newObj.fname='Suyash'
newObj.isWorking=true

console.log(newObj)

console.log(newObj.fname)


console.log('-----------')
console.log(1=='1')                                             //true
console.log(1==='1')                                            //false
console.log(2!=='2') //two int is not equal to string int       //true







