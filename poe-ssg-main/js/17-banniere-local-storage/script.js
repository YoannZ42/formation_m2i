// sélectionner par classe
// document.querySelector('.classe');
const btnSuccess = document.querySelector('.btn-success');
console.log(btnSuccess);

const cookies = document.querySelector('.cookies');
console.log(cookies);

// Au clic sur btnSuccess,
// cookies disparait

function check() {
  if (localStorage.getItem('banniere')) {
    console.log('stockage existe');
    cookies.style.display = 'none';
  }
}

check();

btnSuccess.addEventListener('click', function () {
  // vérifie avec un console.log
  console.log('cliqué');

  cookies.style.display = 'none';

  // ici on stocke le clic de l'utilisateur
  localStorage.setItem('banniere', 'oui');
});
