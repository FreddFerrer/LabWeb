document.addEventListener("keyup", e=>{

  if (e.target.matches("#buscador-analisis")){

      if (e.key ==="Escape")e.target.value = ""

      document.querySelectorAll(".list-group-item").forEach(analisis =>{

          analisis.textContent.toLowerCase().includes(e.target.value.toLowerCase())
            ?analisis.classList.remove("filtro")
            :analisis.classList.add("filtro")
      })

  }
})
var analisis = []
var precios = []

function agregar() {
    let nombreAnalisis = document.getElementById("analisis");
    let precioAnalisis = document.getElementById("analisis");
    console.log(JSON.stringify(nombreAnalisis));
    analisis.push(nombreAnalisis)
    precios.push(precioAnalisis)
    console.log(nombreAnalisis)
}



