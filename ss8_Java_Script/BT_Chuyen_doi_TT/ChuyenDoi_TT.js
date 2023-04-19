function checkID() {
    let a = document.getElementById("nhapvao").value;
    let b = document.getElementById("TuGiaTri").value;
    let c = document.getElementById("QuaGiaTri").value;
    let d = 23000;
    let e;
    if(b == "VietNam" && c == "USD")
    {
       e = a / d
    }
    else if (b == "USD" && c== "VietNam")
    {
        e = a*d
    }
    document.getElementById("f").innerText="Result ="+ e;
}

