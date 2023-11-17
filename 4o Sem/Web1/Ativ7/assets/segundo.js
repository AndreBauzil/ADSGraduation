const num1 = document.getElementById("n1")
const num2 = document.getElementById("n2")
const btn2 = document.getElementById("btn2")
let result2 = document.getElementById("result2")

btn2.onclick = () => {
    console.log(num1.value, num2.value);
    let result = Math.pow(num1.value, num2.value)
    
    console.log(result);
    result2.innerHTML = result
}
