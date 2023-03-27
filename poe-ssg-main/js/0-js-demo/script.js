// ici un commentaire
// je vérifie que index.html est bien relié à script.js
console.log('connecté');

// créer une variable
// let permet de créer une variable
let score = 0;
console.log(score, 'score'); // 0 'score'

score = 1;
console.log(score, 'après'); // 1 'après'

// créer une variable constante = on ne peut pas modifier
const mot = 'Jean';
// mot = 'Durand';
// console.log(mot);

// Concaténation avec Template Literals - back ticks
// altGr7 `
let phrase; // undefined
const mot1 = 'Hello';
const mot2 = 'tout le monde';
// phrase = mot1 + ' ' + mot2;
phrase = `${mot1} ${mot2}`;
console.log(phrase);

// DOM = Document Object Model
// 1 - cibler et stocker l'élément concerné
const title = document.getElementById('title');
console.log(title);

// 2 - modifier la couleur de title
title.style.color = 'purple';
// document.getElementById('title').style.color = 'purple';
// changer le contenu d'un élément HTML
title.innerText = 'Nouveau texte';

/*
Au clic sur le carré, 
le carré change de couleur
on incrémente un compteur de 1
Afficher le résultat dans la page
*/

// 1 - Je sélectionne et stocke le btn-red
const btnRed = document.getElementById('btn-red');
console.log(btnRed);
const btnBlue = document.getElementById('btn-blue');
console.log(btnBlue);

let somme = 0;

// 2 - Agir au clic sur btn-red
// element.addEventListener('click', function(){ })
btnRed.addEventListener('click', function () {
  console.log('cliqué');
  // ici les actions à déclencher
  btnRed.style.backgroundColor = 'blue';

  // déclencher la fonction
  add();
});

// créer un nouveau carré d'une autre couleur
// Au clic, incrémente le même compteur + change de couleur

btnBlue.addEventListener('click', function () {
  console.log('cliqué');
  // ici les actions à déclencher
  btnBlue.style.backgroundColor = 'red';

  // déclencher la fonction
  add();
});

function add() {
  // incrémente le compteur
  somme = somme + 1;
  // Afficher le résultat dans la page
  title.innerText = `Vous avez ${somme} point(s)`;
}
