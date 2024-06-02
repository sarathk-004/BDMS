function login(event) {
  event.preventDefault(); 

  const form = document.getElementById('loginForm');
  const formData = new FormData(form);

  fetch('/login', {
    method: 'POST',
    body: formData
  })
  .then(response => {
    if (!response.ok) {
      throw new Error('Login failed');
    }
    return response.text();
  })
  .then(message => {
    window.location.href = 'network.html'; 
  })
  .catch(error => {
    console.error('Error:', error);
    alert('Login failed');
  });
}


