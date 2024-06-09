document.addEventListener('DOMContentLoaded', function() {
    // Pobierz potrzebne elementy DOM
    var registrationPopup = document.getElementById('registration-popup');
    var closeRegButton = document.getElementById('close-reg');
    var showRegistrationButton = document.getElementById('show-registration-button');

    // Funkcja, która otwiera okno popup dla rejestracji
    function openRegistrationPopup() {
        registrationPopup.style.display = 'block';
    }

    // Funkcja, która zamyka okno popup dla rejestracji
    function closeRegistrationPopup() {
        registrationPopup.style.display = 'none';
    }

    // Obsługa kliknięcia przycisku "Zarejestruj się"
    showRegistrationButton.addEventListener('click', openRegistrationPopup);

    // Obsługa kliknięcia przycisku "Zamknij" w oknie rejestracji
    closeRegButton.addEventListener('click', closeRegistrationPopup);
});
