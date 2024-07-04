// console.log(x); // undefined
let x = 5;
console.log(x); // 5

function test() {
  console.log("x" + x);
  let y = 10;
  console.log(y); // 20
  if (true) {
    // console.log(y); // 20
    let y = 20;
    console.log(y); // 20
  }
  console.log(y); // 20
}
test();
