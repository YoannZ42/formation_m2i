/**
 * cibler et stocker le bouton
 * cibler et stocker une balise html
 *
 * initialiser somme = 0
 *
 * au clic sur le bouton,
 * on incrémente somme
 * on affiche la somme dans la balise
 * condition pour gérer 1 ou plusieurs produits
 */
console.log('connecté');

const btn = document.getElementById('btn');
console.log(btn);
const resultat = document.getElementById('resultat');
console.log(resultat);
// initialiser la variable somme
let somme = 0;

btn.addEventListener('click', function () {
  somme = somme + 1;
  console.log(somme);
  // resultat.innerText = `Vous avez ${somme} produit dans votre panier`;

  if (somme > 0 && somme < 2) {
    resultat.innerText = `Vous avez ${somme} produit dans votre panier`;
  } else {
    resultat.innerText = `Vous avez ${somme} produits dans votre panier`;
  }
});
