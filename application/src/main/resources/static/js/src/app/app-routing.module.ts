import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router'
import { JobPostComponent } from './job-post/job-post.component';
import { JobListComponent } from './job-list/job-list.component';
import { ResumePostComponent } from './resume-post/resume-post.component';
import { ResumeListComponent } from './resume-list/resume-list.component';
import { ReviewPostComponent } from './review-post/review-post.component';
import { ReviewListComponent } from './review-list/review-list.component';


const routes: Routes = [
  {path: 'postJob', component:JobPostComponent},
  {path: 'listJob', component:JobListComponent},
  {path: 'postResume', component:ResumePostComponent},
  {path: 'listResume', component:ResumeListComponent},
  {path: 'postReview', component:ReviewPostComponent},
  {path: 'listReview', component:ReviewListComponent}


]
@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [RouterModule],
  declarations: []
})
export class AppRoutingModule { }
