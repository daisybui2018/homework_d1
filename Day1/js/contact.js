function validateForm() {
    var x = document.forms["contactForm"]["firstname"].value;
    if (x == "") {
      alert("Trường 'Họ' là bắt buộc");
      return false;
    }
  }