import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { TestService } from './services/test';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  template: `
    <h1>{{ message || "Carregando mensagem do backend..." }}</h1>
    <router-outlet></router-outlet>
  `,
  styleUrls: ['./app.scss']
})
export class AppComponent implements OnInit {
  message = '';

  constructor(private testService: TestService) {}

  ngOnInit() {
    this.testService.getMessage().subscribe(response => {
      this.message = response;
    });
  }
}
