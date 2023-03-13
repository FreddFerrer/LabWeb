import { Component, OnInit } from '@angular/core';
import { BuscadorComponent } from '../buscador/buscador.component';
import { IAnalisis } from '../interfaces/Ianalisis';
import { HttpClient } from '@angular/common/http';
<<<<<<< HEAD
=======
import { AnalisisService } from '../services/analisis-service.service';
>>>>>>> prod

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit{

<<<<<<< HEAD
  searchTerm: string = '';

  ngOnInit(): void {
  }

=======

  
  buscarAnalisis(event: KeyboardEvent){
    const valor = (event.target as HTMLInputElement).value;
    
    console.log(valor)
  }


  ngOnInit(): void {
    
  }
>>>>>>> prod
}
