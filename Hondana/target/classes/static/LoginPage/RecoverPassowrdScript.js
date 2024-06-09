document.addEventListener('DOMContentLoaded', function() {
    // Pobierz potrzebne elementy DOM
    var passwordRecoveryPopup = document.getElementById('password-recovery-popup');
    var closeButton = document.getElementById('close');
    var recoverPasswordButton = document.getElementById('recover-password-button');

    // Funkcja, która otwiera okno popup
    function openPopup() {
        passwordRecoveryPopup.style.display = 'block';
    }

    // Funkcja, która zamyka okno popup
    function closePopup() {
        passwordRecoveryPopup.style.display = 'none';
    }

    // Obsługa kliknięcia przycisku "Zamknij"
    closeButton.addEventListener('click', closePopup);

    // Obsługa kliknięcia przycisku "Odzyskaj hasło"
    recoverPasswordButton.addEventListener('click', openPopup);
});
