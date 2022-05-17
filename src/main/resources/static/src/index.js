const menu_toggle = document.querySelector('.menu-toggle');
const sidebar = document.querySelector('.sidebar');

menu_toggle.addEventListener('click', () => {
    menu_toggle.classList.toggle('is-active');
    sidebar.classList.toggle('is-active');
});

function clickTablaRT(row) {
    // Manejar el evento click que se hace en la tabla de recursos tecnológicos
    // Obtener el índice y enviarlo a la clase de la pantalla 
    const request = new XMLHttpRequest();
    request.open("POST", "http://localhost:8080/reg-ingreso/seleccion-rt", true);
    request.setRequestHeader("Content-type", "application/json");
    request.send(row.rowIndex);
}


