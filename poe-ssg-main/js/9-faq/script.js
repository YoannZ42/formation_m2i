/**
 * sélectionner et stocker les divs questions
 *
 * itérer dans les questions (forEach)
 * Ajouter un événement à chaque élément du tableau
 *
 * <div>
 * Question 1
 * <i>chevron</i>
 * </div>
 * <div>Réponse 1</div>
 *
 * <div>Question 2</div>
 * <div>Réponse 2</div>
 *
 * const next = pointdeReference.nextElementSibling
 * alterner le style avec next.classList.toggle('class');
 *
 * pointdeReference.lastElementChild
 * <i class="fas fa-chevron-down"></i>
 * <i class="fas fa-chevron-up"></i>
 *
 *
 */
//console.log('connecté');

const questions = document.querySelectorAll('.question');
//console.log(questions);

questions.forEach(function (item) {
  //console.log(item);

  item.addEventListener('click', function () {
    //console.log(item);

    // item devient mon point de référence
    const next = item.nextElementSibling;
    // console.log(next);

    next.classList.toggle('visible');

    // modifier l'icône
    const icone = item.lastElementChild;
    console.log(icone);

    icone.classList.toggle('fa-chevron-up');
  });
});
