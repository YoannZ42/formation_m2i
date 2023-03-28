import { MessageI } from "../interfaces/message-i";

export class Message implements MessageI{
  user!: string;
  date = "2023-03-28";
  contenu!: string;
  canal!:number;
  id!: number;

}
