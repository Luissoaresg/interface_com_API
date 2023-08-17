const form = document.querySelector("form");
const iNome = document.querySelector(".nome");
const iEmail = document.querySelector(".email");
const iSenha = document.querySelector(".senha");
const iTel = document.querySelector(".tel");

function cadastrar() {

    fetch("http://localhost:8080/usuarios",
        {
            headers: {
                'Aceept': 'application/json',
                'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify({
                nome: iNome.value,
                email: iEmail.value,
                senha: iSenha.value,
                telefone: iTel.value
            })
        })
        .then(function (res) { console.log(res) })
        .catch(function (res) { console.log(res) })

};

function limpar() {
    iNome.value = "";
    iEmail.value = "";
    iSenha.value = "";
    iTel.value = "";
};

form.addEventListener('submit', function (event) {
    event.preventDefault();

    cadastrar();
    limpar();
});