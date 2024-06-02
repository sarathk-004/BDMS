function signup(event) {
  event.preventDefault(); 
  const form = document.getElementById('signupForm');
  const formData = new FormData(form);

  fetch('/signup', {
    method: 'POST',
    body: JSON.stringify(Object.fromEntries(formData)),
    headers: {
      'Content-Type': 'application/json'
    }
  })
  .then(response => response.json())
  .then(data => {
    if (data.success) {
      alert('Sign up successful!');
    } else {
      alert('Sign up failed: ' + data.message);
    }
  })
  .catch(error => {
    console.error('Error:', error);
    alert('Sign up failed');
  });
}