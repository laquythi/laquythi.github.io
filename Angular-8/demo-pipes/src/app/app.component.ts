import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public content : string = `lã quý thi đông sơn đông hưng thái bình một người trong đêm không phải anh cô đơn,ta bên nhau cứ SAY TA QUÊN HẾT SỰ ĐỜI,mặc kệ ngoài kia có bao nhiêu dèm pha,tâm ta vẫn yên vui ko ganh đua cuộc đời and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.`;
  public title : string = `Tự học Angular 9`;
  public amount : number = 35.1425678374;
  public result : number = 0.85169583943;
  public array : string[] = ['abc','def','ghi','123','456','789'];
  public total : number = 85.683958754;
  public today : Date = new Date();
}
