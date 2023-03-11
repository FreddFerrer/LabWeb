document.addEventListener("keyup", e=>{

  if (e.target.matches("#buscador-analisis")){

      if (e.key ==="Escape")e.target.value = ""

      document.querySelectorAll(".btn").forEach(analisis =>{

          analisis.textContent.toLowerCase().includes(e.target.value.toLowerCase())
            ?analisis.classList.remove("filtro")
            :analisis.classList.add("filtro")
      })

  }
})

var precios = []

var analisisSeleccionados = [];

function agregarAnalisis(listaObjetos) {

    var botones = document.querySelectorAll('button[name="analisis"]');

    botones.forEach(function(boton) {
        boton.addEventListener("click", function() {
            var id = boton.value;
            var objetoSeleccionado = listaObjetos.find(function(objeto) {
                return objeto.id === id;
            });
            analisisSeleccionados.push(objetoSeleccionado);
            console.log(analisisSeleccionados)
        });
        console.log(analisisSeleccionados)
    });
    console.log(analisisSeleccionados)
    return analisisSeleccionados;
}












