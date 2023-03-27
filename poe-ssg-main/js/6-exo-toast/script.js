console.log('connecté');

/**
 * sélectionner et stocker le btn
 * sélectionner et stocker resultat
 *
 * au clic sur le btn
 * création de div
 * donner du style à la div
 *
 * place la nouvelle DIV dans resultat
 *
 * faire disparaitre la DIV au bout de 3 secondes par exemple
 */

const btn = document.getElementById('btn');
console.log(btn);
const resultat = document.getElementById('resultat');
console.log(resultat);

btn.addEventListener('click', function () {
  // console.log('cliqué');

  // création et stockage d'un element HTML
  const notif = document.createElement('div');

  // donner du style à la div
  // element.classList.add('classe');
  notif.classList.add('carre');
  console.log(notif);

  // placer dans une DIV (resultat)
  // contenant.appendChild(contenu)
  resultat.appendChild(notif);

  // Démarrer un compteur
  // Faire disparaitre notif
  // setTimeout(fct(){}, délai en ms)
  setTimeout(function () {
    // retirer la DIV du DOM
    // element.remove();
    notif.remove();
  }, 1000);
});
