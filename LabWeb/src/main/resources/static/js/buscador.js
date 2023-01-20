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
var analisis = []
var precios = []
var elementosSeleccionados = [];

  function agregarElemento(id, nombre) {
      var elemento = { id: id, nombre: nombre };
      elementosSeleccionados.push(elemento);
      console.log(elementosSeleccionados)
  }










