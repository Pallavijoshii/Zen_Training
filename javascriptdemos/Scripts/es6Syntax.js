//le,const

//functional programming


var x=10
let y='Hello'

for(var i=0;i<10;i++){
    console.log(i)
}

console.log('----------------')
//console.log(i)


var nums=[3,6,8,9,10,12,34]
var res=nums.map(function(a){
    return a*2
})
console.log(res)

var res1 = nums.map((a)=>a*2)
console.log(res1)


var res2 = nums.map(a=>a*2)            //for only 1 parameter we dont need to put ()


var res3= (x,y)=>{x+y}                   //addition function for 2 parameters
