/*
sélectionner et stocker le btn
sélectionner et stocker l'icône

Au clic sur le bouton,
le texte du bouton change (avec conditions)
la couleur du bouton change

Au clic sur l'icône, 
la couleur de l'icône change
l'icône change vers fa-smile-wink
*/
const btn = document.querySelector('.btn');
console.log(btn);
const icone = document.querySelector('.far.fa-meh-blank');
console.log(icone);

btn.addEventListener('click', function () {
  console.log('cliqué');

  if (btn.innerText === 'Abonnez-vous') {
    btn.innerText = 'Abonné';
  } else {
    btn.innerText = 'Abonnez-vous';
  }

  // méthode element.classList.toggle('class');
  btn.classList.toggle('abonne');
});

icone.addEventListener('click', function () {
  console.log('icone cliquée');

  // classe appliquée en alternance avec classList.toggle()
  icone.classList.toggle('happy');

  // modifier l'icône
  icone.classList.toggle('fa-smile-wink');

});
