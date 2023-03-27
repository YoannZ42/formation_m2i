/**
 * sélectionner et stocker les inputs
 * sélectionner et stocker le form
 *
 * Validation de formulaire avec des conditions
 * Afficher les erreurs dans les DIV erreurs
 * Donner un style d'erreur à l'input (en option)
 *
 * Redirection
 * window.location.href = 'cheminAccess.html'
 *
 *
 */
// 1 - Je sélectionne et stocke tous les éléments nécessaires
const form = document.getElementById('formulaire');
const prenom = document.getElementById('prenom');
const nom = document.getElementById('nom');
const email = document.getElementById('email');
const message = document.getElementById('message');

const msgError = document.querySelectorAll('.error');
console.log(msgError);

form.addEventListener('submit', function (e) {
  // empêcher le rafraichissement de la page
  e.preventDefault();

  // Je récupère les valeurs de chacun des inputs
  const prenomValue = prenom.value.trim();
  const nomValue = nom.value.trim();
  const emailValue = email.value.trim();
  const messageValue = message.value.trim();

  // je rends invisible toutes les erreurs
  msgError.forEach(function (error) {
    error.classList.add('invisible');
  });

  // Je vérifie les informations de l'utilisateur
  // Validation de formulaire

  if (prenomValue.length < 2 || prenomValue.length > 10) {
    console.log('erreur prenom');
    // rendre visible l'erreur concernée ?
    console.log(prenom.nextElementSibling); // <div>Erreur sur prénom</div>
    prenom.nextElementSibling.classList.remove('invisible');
  } else if (nomValue.length < 3 || nomValue.length > 15) {
    console.log('erreur nom');
    nom.nextElementSibling.classList.remove('invisible');
  } else if (messageValue.length < 10 || messageValue.length > 100) {
    console.log('erreur message');
    message.nextElementSibling.classList.remove('invisible');
  } else {
    console.log('succès');
    window.location.href = 'thankyou.html';
  }
});
