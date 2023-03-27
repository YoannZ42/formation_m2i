console.log('connecté');

// cibler et stocker le bouton enregistrer
const btn = document.querySelector('.btn');
console.log(btn);
// cibler et stocker container-notifications
const ctn = document.querySelector('.container-notifications');
console.log(ctn);

btn.addEventListener('click', function () {
  // option 1
  //   const notif = document.createElement('div');
  //   // console.log(notif);

  //   notif.classList.add('toast');

  //   notif.innerHTML = 'Votre fichier est bien enregistré';
  //   console.log(notif);

  //   ctn.appendChild(notif);

  // option 2 - créer et insérer une div avec les template litterals
  ctn.innerHTML += `
                    <div class='toast'>
                        Votre fichier est bien enregistré
                    </div>
                   `;

  setTimeout(function () {
    document.querySelector('.toast').remove();
  }, 1000);
});
