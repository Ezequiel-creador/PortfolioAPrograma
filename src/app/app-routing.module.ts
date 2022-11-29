import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CrearExperienciaComponent } from './componentes/crear-experiencia/crear-experiencia.component';
import { EditarExperienciaComponent } from './componentes/editar-experiencia/editar-experiencia.component';
import { IniciarSesionComponent } from './componentes/iniciar-sesion/iniciar-sesion.component';
import { PortfolioComponent } from './componentes/portfolio/portfolio.component';
import { EditarEducacionComponent } from './componentes/editar-educacion/editar-educacion.component';
import { ProyectosComponent } from './componentes/proyectos/proyectos.component';
import { CrearEducacionComponent } from './componentes/crear-educacion/crear-educacion.component';

const routes: Routes = [
  {path: '', component: PortfolioComponent},
  {path: 'iniciar-sesion', component:IniciarSesionComponent},
  {path: 'editar-experiencia', component:EditarExperienciaComponent},
  {path: 'crear-experiencia', component: CrearExperienciaComponent},
  {path: 'editar-educacion/:id', component: EditarEducacionComponent},
  {path: 'proyectos', component: ProyectosComponent},
  {path: 'crear-educacion', component: CrearEducacionComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash: true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }