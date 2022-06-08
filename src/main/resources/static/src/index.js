const menu_toggle = document.querySelector('.menu-toggle');
const sidebar = document.querySelector('.sidebar');

const baseUrl = "http://localhost:8080";

menu_toggle.addEventListener('click', () => {
    menu_toggle.classList.toggle('is-active');
    sidebar.classList.toggle('is-active');
});


function start(){
    let inputFechaPrevista = document.querySelector('#input-fecha-prevista');
    inputFechaPrevista.value = "";
    
    let inputRazonMantenimiento = document.querySelector('#input-razon-mantenimiento');
    inputRazonMantenimiento.value = "";
}

function sendPostRequest(url, data){
    const request = new XMLHttpRequest();
    request.open("POST", baseUrl + url, true);
    request.setRequestHeader("Content-type", "application/json");
    request.send(data);
}

// function start(){
//     const request = new XMLHttpRequest();
//     request.open("GET", baseUrl + "/reg-ingreso", true);
//     request.setRequestHeader("Content-type", "application/json");
//     request.send(data);
// }

function clickTablaRT(row) {
    // Manejar el evento click que se hace en la tabla de recursos tecnológicos
    // Obtener el índice y enviarlo a la clase de la pantalla 
    const index = row.rowIndex;
    sendPostRequest("/reg-ingreso/tomar-indice-rt", index); 
}

function clickFechaPrevista(value){
    sendPostRequest("/reg-ingreso/tomar-fecha-prevista", value);
}

function focusOutRazonMantenimiento(value){
    if(value.trim().length != 0 || value != ""){
        sendPostRequest("/reg-ingreso/tomar-razon-mantenimiento", value);
    }
}

start();