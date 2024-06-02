document.addEventListener('DOMContentLoaded', () => {
  const requestBloodBtn = document.getElementById('requestBloodBtn');
  const becomeDonorBtn = document.getElementById('becomeDonorBtn');
  const donorRegisterSection = document.getElementById('donorRegister');
  const requestBloodSection = document.getElementById('requestBlood');

  requestBloodBtn.addEventListener('click', () => {
    donorRegisterSection.style.display = 'none';
    requestBloodSection.style.display = 'block';
  });

  becomeDonorBtn.addEventListener('click', () => {
    requestBloodSection.style.display = 'none';
    donorRegisterSection.style.display = 'block';
  });

  const donorForm = document.getElementById('donorForm');
  donorForm.addEventListener('submit', (event) => {
    event.preventDefault();
    alert('Donor registration form submitted');
  });

  const requestForm = document.getElementById('requestForm');
  requestForm.addEventListener('submit', (event) => {
    event.preventDefault();
    alert('Blood request form submitted');
  });
});

function toggleDropdown() {
  var dropdown = document.getElementById("profile-dropdown");
  if (dropdown.style.display === "none" || dropdown.style.display === "") {
    dropdown.style.display = "block";
    document.addEventListener("click", closeDropdownOutsideClick);
  } else {
    dropdown.style.display = "none";
    document.removeEventListener("click", closeDropdownOutsideClick); 
  }
}