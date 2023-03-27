console.log('connecté');

/**
 * sélectionner et stocker le formulaire
 *
 * sélectionner et stocker chacun des inputs
 * .value
 *
 */

//const form = document.getElementById('form').elements;
const prenom = document.getElementById('prenom');
// console.log(prenom);
const nom = document.getElementById('nom');
//console.log(nom);
const pwd = document.getElementById('pwd');
//console.log(pwd);

form.addEventListener('submit', function (e) {
  e.preventDefault();

  const prenomValue = prenom.value.trim(); // valeur renseignée par l'utilisateur
  const nomValue = nom.value.trim();
  const pwdValue = pwd.value.trim();

  // console.log(nom.value); // valeur renseignée par l'utilisateur
  // console.log(pwd.value); // valeur renseignée par l'utilisateur

  // Validation de formulaire
  // conditions pour vérifier la longueur des caractères
  // création d'un objet avec les valeurs
  // méthode fetch + post

  // Validez autant que vous pouvez côté client( javascript)
  // prénom entre 2 et 10 caractères
  // nom entre 3 et 20 caractères
  // pwd entre 8 et 15 caractères

  if (prenomValue.length < 2 || prenomValue.length > 10) {
    console.log('votre prénom doit être compris entre 2 et 10 caractères');
    // afficher dans la page
  } else if (nomValue.length < 3 || nomValue.length > 20) {
    console.log('votre nom doit être compris entre 3 et 20 caractères');
    // afficher dans la page
  } else if (pwdValue.length < 8 || pwdValue.length > 15) {
    console.log('votre pwd doit être compris entre 8 et 15 caractères');
    // afficher dans la page
  } else {
    console.log('formulaire validé');
    // récupérer les inputs
    // stocker dans un nouvel objet
    const user = {
      prenom: prenomValue,
      nom: nom.value,
      password: pwd.value,
    };
    console.log(user);
    // nouvel objet à une bdd

    // méthode pour faire une requête POST
    // methode fetch


  }
});
