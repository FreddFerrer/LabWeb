import { Component } from '@angular/core';
import { AnalisisService } from '../../services/analisis-service.service';
import { IAnalisis } from '../../interfaces/Ianalisis';

@Component({
  selector: 'app-analisis',
  templateUrl: './analisis.component.html',
  styleUrls: ['./analisis.component.css']
})
export class AnalisisComponent {

  analisisSeleccionados: IAnalisis[];
<<<<<<< HEAD
  precios: number[];
=======
  precios: number;
>>>>>>> prod

  constructor(public analisisService: AnalisisService){
    this.analisisSeleccionados = [];
  }

  mostrarAnalisis(analisis: IAnalisis){
    this.analisisSeleccionados.push(analisis);
<<<<<<< HEAD
    
  }

  sumarAnalisis(precio: number){

=======
  }

  sumarAnalisis(){
    this.precios = this.analisisSeleccionados.reduce((total, analisis) => total + analisis.precio, 0);
>>>>>>> prod
  }

}
