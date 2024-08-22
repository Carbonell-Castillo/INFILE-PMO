import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { post } from "../modelos/post";

@Injectable({
    providedIn: 'root'
})
export class ServicioService {

    constructor(private http: HttpClient) { }
    private url = 'http://localhost:8080';

    //registrar usuario
    registrarUsuario(usuario: any) {
        const options = {responseType: 'text' as 'json'};
        return this.http.post<any>(this.url + '/registrar_usuario', usuario, options);
    }

    //login
    login(usuario: any) {
        const options = {responseType: 'text' as 'json'};
        return this.http.post<any>(this.url + '/login', usuario, options);
    }

    //crear post
    crearPost(post: any) {
        const options = {responseType: 'text' as 'json'};
        return this.http.post<any>(this.url + '/publicar_post', post, options);
    }

    getPosts() {
        return this.http.get<post[]>(this.url + '/listar_post');

    }

    //editar post
    editarUsuario(post: any) {
        const options = {responseType: 'text' as 'json'};
        return this.http.post<any>(this.url + '/editar_usuario', post, options);
    }

    getUsuarios() {
        return this.http.get<any>(this.url + '/listar_usuarios');
    }
    

}
