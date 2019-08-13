var a1=[]
a1=["Apple","Mango","Banana","Kiwi"];
 
document.getElementById("demo").innerHTML=a1.toString();//first
console.log(a1)
 
document.getElementById("demo").innerHTML = a1.join(" * ");//second
 
a1.pop();
document.getElementById("demo").innerHTML=a1;//third
console.log(a1)
 
document.getElementById("demo").innerHTML = a1.pop(); //fourth
console.log(a1)
 
console.log(a1.shift()) //ten
console.log(a1)
 
console.log(a1.push("Banana","kiwi")) //fifth
console.log(a1)
 
console.log(a1.unshift("Grapes")) //sixth
console.log(a1)
 
console.log(a1.unshift("Watermelon")) //seventh
console.log(a1)
 
console.log(a1[3]="Papaya") //eight
console.log(a1)
 
console.log(a1[a1.length]="Orange") //nine
console.log(a1)
            
            









<html>
<head>
<script type="text/javascript">
function vform()
{
var email = document.Form.Email;
if (email.value == "" || (email.value.indexOf("@", 0) < 0) || (email.value.indexOf(".", 0) < 0))
{
window.alert("Please enter a valid e-mail address.");
email.focus();
return false;
}
}
</script>
</head>
<body>
<form name="Form" method="post" onsubmit="return vform();">
<tr>
<td> Email:</td>
<td><input type="text" name="Email"></td>
</tr>
<tr>
<td></td>
    <td><input type="submit" name = "sub" value = "Submit"></td>
</tr>
</form>
</body>
</html>








<html>
<head>
<script type="text/javascript">
function vform()
{
var email = document.Form.Email;
if (email.value == "" || (email.value.indexOf("@", 0) < 0) || (email.value.indexOf(".", 0) < 0))
{
window.alert("Please enter a valid e-mail address.");
email.focus();
return false;
}
}
</script>
</head>
<body>
<form name="Form" method="post" onsubmit="return vform();">
<tr>
<td> Email:</td>
<td><input type="text" name="Email"></td>
</tr>
<tr>
<td></td>
    <td><input type="submit" name = "sub" value = "Submit"></td>
</tr>
</form>
</body>
</html>