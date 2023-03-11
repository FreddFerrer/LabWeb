import { Component, OnInit } from '@angular/core';
import { BuscadorComponent } from '../buscador/buscador.component';
import { IAnalisis } from '../interfaces/Ianalisis';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit{

  searchTerm: string = '';

  ngOnInit(): void {
  }

}
