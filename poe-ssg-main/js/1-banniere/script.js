// sélectionner par classe
// document.querySelector('.classe');
const btnSuccess = document.querySelector('.btn-success');
console.log(btnSuccess);

const cookies = document.querySelector('.cookies');
console.log(cookies);

// Au clic sur btnSuccess,
// cookies disparait

btnSuccess.addEventListener('click', function () {
  // vérifie avec un console.log
  console.log('cliqué');

  cookies.style.display = 'none';
});
