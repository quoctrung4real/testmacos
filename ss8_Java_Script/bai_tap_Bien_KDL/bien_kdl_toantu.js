let inputA
let inputB
let inputC
inputA = prompt("Nhap diem Vat Ly");
inputB = prompt("Nhap diem Hoa Hoc");
inputC = prompt("Nhap diem Sinh Hoc");
let A = parseInt(inputA);
let B = parseInt(inputB);
let C = parseInt(inputC);
let DiemTrungBinh = (A+B+C)/3
let DiemTong = A+B+C
document.write("Tong diem 3 mon la " + DiemTong + "<br>");

document.write("Diem trung binh la " + DiemTrungBinh);
