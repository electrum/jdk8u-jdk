/*
 * Copyright (c) 1996, 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package sun.applet.resources;

import java.util.ListResourceBundle;

public class MsgAppletViewer_pt_BR extends ListResourceBundle {

    public Object[][] getContents() {
        Object[][] temp = new Object[][] {
            {"textframe.button.dismiss", "Rejeitar"},
            {"appletviewer.tool.title", "Visualizador do Applet: {0}"},
            {"appletviewer.menu.applet", "Applet"},
            {"appletviewer.menuitem.restart", "Reiniciar"},
            {"appletviewer.menuitem.reload", "Recarregar"},
            {"appletviewer.menuitem.stop", "Interromper"},
            {"appletviewer.menuitem.save", "Salvar"},
            {"appletviewer.menuitem.start", "Iniciar"},
            {"appletviewer.menuitem.clone", "Clonar..."},
            {"appletviewer.menuitem.tag", "Tag..."},
            {"appletviewer.menuitem.info", "Informa\u00E7\u00F5es..."},
            {"appletviewer.menuitem.edit", "Editar"},
            {"appletviewer.menuitem.encoding", "Codifica\u00E7\u00E3o do Caractere"},
            {"appletviewer.menuitem.print", "Imprimir..."},
            {"appletviewer.menuitem.props", "Propriedades..."},
            {"appletviewer.menuitem.close", "Fechar"},
            {"appletviewer.menuitem.quit", "Sair"},
            {"appletviewer.label.hello", "Ol\u00E1..."},
            {"appletviewer.status.start", "iniciando o applet..."},
            {"appletviewer.appletsave.filedialogtitle","Serializar Applet no Arquivo"},
            {"appletviewer.appletsave.err1", "serializando um {0} para {1}"},
            {"appletviewer.appletsave.err2", "no appletSave: {0}"},
            {"appletviewer.applettag", "Tag mostrada"},
            {"appletviewer.applettag.textframe", "Tag HTML do Applet"},
            {"appletviewer.appletinfo.applet", "-- nenhuma informa\u00E7\u00E3o do applet --"},
            {"appletviewer.appletinfo.param", "-- sem informa\u00E7\u00E3o de par\u00E2metro --"},
            {"appletviewer.appletinfo.textframe", "Informa\u00E7\u00F5es do Applet"},
            {"appletviewer.appletprint.fail", "Falha na impress\u00E3o."},
            {"appletviewer.appletprint.finish", "Impress\u00E3o finalizada."},
            {"appletviewer.appletprint.cancel", "Impress\u00E3o cancelada."},
            {"appletviewer.appletencoding", "Codifica\u00E7\u00E3o de Caractere: {0}"},
            {"appletviewer.parse.warning.requiresname", "Advert\u00EAncia: a tag <param name=... value=...> requer um atributo de nome."},
            {"appletviewer.parse.warning.paramoutside", "Advert\u00EAncia: a tag <param> externa <applet> ... </applet>."},
            {"appletviewer.parse.warning.applet.requirescode", "Advert\u00EAncia: a tag <applet> requer um atributo de c\u00F3digo."},
            {"appletviewer.parse.warning.applet.requiresheight", "Advert\u00EAncia: a tag <applet> requer um atributo de altura."},
            {"appletviewer.parse.warning.applet.requireswidth", "Advert\u00EAncia: a tag <applet> requer um atributo de largura."},
            {"appletviewer.parse.warning.object.requirescode", "Advert\u00EAncia: a tag <object> requer um atributo de c\u00F3digo."},
            {"appletviewer.parse.warning.object.requiresheight", "Advert\u00EAncia: a tag <object> requer um atributo de altura."},
            {"appletviewer.parse.warning.object.requireswidth", "Advert\u00EAncia: a tag <object> requer um atributo de largura."},
            {"appletviewer.parse.warning.embed.requirescode", "Advert\u00EAncia: a tag <embed> requer um atributo de c\u00F3digo."},
            {"appletviewer.parse.warning.embed.requiresheight", "Advert\u00EAncia: a tag <embed> requer um atributo de altura."},
            {"appletviewer.parse.warning.embed.requireswidth", "Advert\u00EAncia: a tag <embed> requer um atributo de largura."},
            {"appletviewer.parse.warning.appnotLongersupported", "Advert\u00EAncia: a tag <app> n\u00E3o \u00E9 mais suportada; use <applet>:"},
            {"appletviewer.usage", "Uso: appletviewer <op\u00E7\u00F5es> url(s)\n\nem que as <op\u00E7\u00F5es> incluem:\n  -debug                  Inicia o visualizador do applet no depurador Java\n  -encoding <codifica\u00E7\u00E3o>    Especifica a codifica\u00E7\u00E3o de caractere usada pelos arquivos HTML\n  -J<flag de runtime>        Informa o argumento ao intepretador java\n\nA op\u00E7\u00E3o -J n\u00E3o \u00E9 padr\u00E3o e est\u00E1 sujeita \u00E0 altera\u00E7\u00E3o sem notifica\u00E7\u00E3o."},
            {"appletviewer.main.err.unsupportedopt", "Op\u00E7\u00E3o n\u00E3o suportada: {0}"},
            {"appletviewer.main.err.unrecognizedarg", "Argumento n\u00E3o reconhecido: {0}"},
            {"appletviewer.main.err.dupoption", "Uso duplicado da op\u00E7\u00E3o: {0}"},
            {"appletviewer.main.err.inputfile", "Nenhum arquivo de entrada especificado."},
            {"appletviewer.main.err.badurl", "URL Inv\u00E1lido: {0} ( {1} )"},
            {"appletviewer.main.err.io", "Exce\u00E7\u00E3o de E/S ao ler: {0}"},
            {"appletviewer.main.err.readablefile", "Certifique-se de que {0} seja um arquivo e seja leg\u00EDvel."},
            {"appletviewer.main.err.correcturl", "O URL {0} est\u00E1 correto?"},
            {"appletviewer.main.prop.store", "Propriedades espec\u00EDficas do usu\u00E1rio do AppletViewer"},
            {"appletviewer.main.err.prop.cantread", "N\u00E3o \u00E9 poss\u00EDvel ler o arquivo de propriedades do usu\u00E1rio: {0}"},
            {"appletviewer.main.err.prop.cantsave", "N\u00E3o \u00E9 poss\u00EDvel salvar o arquivo de propriedades do usu\u00E1rio: {0}"},
            {"appletviewer.main.warn.nosecmgr", "Advert\u00EAncia: desativando a seguran\u00E7a."},
            {"appletviewer.main.debug.cantfinddebug", "N\u00E3o \u00E9 poss\u00EDvel localizar o depurador!"},
            {"appletviewer.main.debug.cantfindmain", "N\u00E3o \u00E9 poss\u00EDvel localizar o m\u00E9todo principal no depurador!"},
            {"appletviewer.main.debug.exceptionindebug", "Exce\u00E7\u00E3o no depurador!"},
            {"appletviewer.main.debug.cantaccess", "N\u00E3o \u00E9 poss\u00EDvel acessar o depurador!"},
            {"appletviewer.main.nosecmgr", "Advert\u00EAncia: SecurityManager n\u00E3o instalado!"},
            {"appletviewer.main.warning", "Advert\u00EAncia: Nenhum applet iniciado. Certifique-se de que a entrada contenha uma tag <applet>."},
            {"appletviewer.main.warn.prop.overwrite", "Advert\u00EAncia: Substituindo a propriedade do sistema temporariamente a pedido do usu\u00E1rio: chave: {0} valor antigo: {1} valor novo: {2}"},
            {"appletviewer.main.warn.cantreadprops", "Advert\u00EAncia: N\u00E3o \u00E9 poss\u00EDvel ler o arquivo de propriedades AppletViewer: {0} Usando defaults."},
            {"appletioexception.loadclass.throw.interrupted", "carregamento de classe interrompido: {0}"},
            {"appletioexception.loadclass.throw.notloaded", "classe n\u00E3o carregada: {0}"},
            {"appletclassloader.loadcode.verbose", "Fluxo de abertura para: {0} para obter {1}"},
            {"appletclassloader.filenotfound", "Arquivo n\u00E3o encontrado ao procurar: {0}"},
            {"appletclassloader.fileformat", "Exce\u00E7\u00E3o de formato do arquivo ao carregar: {0}"},
            {"appletclassloader.fileioexception", "Exce\u00E7\u00E3o de E/S ao carregar: {0}"},
            {"appletclassloader.fileexception", "exce\u00E7\u00E3o de {0} ao carregar: {1}"},
            {"appletclassloader.filedeath", "{0} eliminado ao carregar: {1}"},
            {"appletclassloader.fileerror", "erro de {0} ao carregar: {1}"},
            {"appletclassloader.findclass.verbose.openstream", "Fluxo de abertura para: {0} para obter {1}"},
            {"appletclassloader.getresource.verbose.forname", "AppletClassLoader.getResource do nome: {0}"},
            {"appletclassloader.getresource.verbose.found", "Recurso encontrado: {0} como um recurso do sistema"},
            {"appletclassloader.getresourceasstream.verbose", "Recurso encontrado: {0} como um recurso do sistema"},
            {"appletpanel.runloader.err", "Par\u00E2metro de c\u00F3digo ou objeto!"},
            {"appletpanel.runloader.exception", "exce\u00E7\u00E3o ao desserializar {0}"},
            {"appletpanel.destroyed", "Applet destru\u00EDdo."},
            {"appletpanel.loaded", "Applet carregado."},
            {"appletpanel.started", "Applet iniciado."},
            {"appletpanel.inited", "Applet inicializado."},
            {"appletpanel.stopped", "Applet interrompido."},
            {"appletpanel.disposed", "Applet descartado."},
            {"appletpanel.nocode", "A tag APPLET n\u00E3o encontrou o par\u00E2metro CODE."},
            {"appletpanel.notfound", "carga: classe {0} n\u00E3o encontrada."},
            {"appletpanel.nocreate", "carga: {0} n\u00E3o pode ser instanciada."},
            {"appletpanel.noconstruct", "carga: {0} n\u00E3o \u00E9 p\u00FAblica ou n\u00E3o tem construtor p\u00FAblico."},
            {"appletpanel.death", "eliminado"},
            {"appletpanel.exception", "exce\u00E7\u00E3o: {0}."},
            {"appletpanel.exception2", "exce\u00E7\u00E3o: {0}: {1}."},
            {"appletpanel.error", "erro: {0}."},
            {"appletpanel.error2", "erro: {0}: {1}."},
            {"appletpanel.notloaded", "Inic: applet n\u00E3o carregado."},
            {"appletpanel.notinited", "Iniciar: applet n\u00E3o inicializado."},
            {"appletpanel.notstarted", "Interromper: applet n\u00E3o inicializado."},
            {"appletpanel.notstopped", "Destruir: applet n\u00E3o interrompido."},
            {"appletpanel.notdestroyed", "Descartar: applet n\u00E3o destru\u00EDdo."},
            {"appletpanel.notdisposed", "Carregar: applet n\u00E3o descartado."},
            {"appletpanel.bail", "Interrompido: esvaziando."},
            {"appletpanel.filenotfound", "Arquivo n\u00E3o encontrado ao procurar: {0}"},
            {"appletpanel.fileformat", "Exce\u00E7\u00E3o de formato do arquivo ao carregar: {0}"},
            {"appletpanel.fileioexception", "Exce\u00E7\u00E3o de E/S ao carregar: {0}"},
            {"appletpanel.fileexception", "exce\u00E7\u00E3o de {0} ao carregar: {1}"},
            {"appletpanel.filedeath", "{0} eliminado ao carregar: {1}"},
            {"appletpanel.fileerror", "erro de {0} ao carregar: {1}"},
            {"appletpanel.badattribute.exception", "Parse de HTML: valor incorreto do atributo de largura/altura"},
            {"appletillegalargumentexception.objectinputstream", "AppletObjectInputStream requer um carregador n\u00E3o nulo"},
            {"appletprops.title", "Propriedades do AppletViewer"},
            {"appletprops.label.http.server", "Servidor proxy Http:"},
            {"appletprops.label.http.proxy", "Porta proxy Http:"},
            {"appletprops.label.network", "Acesso de rede:"},
            {"appletprops.choice.network.item.none", "Nenhum"},
            {"appletprops.choice.network.item.applethost", "Host do Applet"},
            {"appletprops.choice.network.item.unrestricted", "Irrestrito"},
            {"appletprops.label.class", "Acesso \u00E0 classe:"},
            {"appletprops.choice.class.item.restricted", "Restrito"},
            {"appletprops.choice.class.item.unrestricted", "Irrestrito"},
            {"appletprops.label.unsignedapplet", "Permitir applets n\u00E3o assinados:"},
            {"appletprops.choice.unsignedapplet.no", "N\u00E3o"},
            {"appletprops.choice.unsignedapplet.yes", "Sim"},
            {"appletprops.button.apply", "Aplicar"},
            {"appletprops.button.cancel", "Cancelar"},
            {"appletprops.button.reset", "Redefinir"},
            {"appletprops.apply.exception", "Falha ao salvar as propriedades: {0}"},
            /* 4066432 */
            {"appletprops.title.invalidproxy", "Entrada Inv\u00E1lida"},
            {"appletprops.label.invalidproxy", "A Porta Proxy deve ser um valor inteiro positivo."},
            {"appletprops.button.ok", "OK"},
            /* end 4066432 */
            {"appletprops.prop.store", "Propriedades espec\u00EDficas do usu\u00E1rio do AppletViewer"},
            {"appletsecurityexception.checkcreateclassloader", "Exce\u00E7\u00E3o de Seguran\u00E7a: carregador de classes"},
            {"appletsecurityexception.checkaccess.thread", "Exce\u00E7\u00E3o de Seguran\u00E7a: thread"},
            {"appletsecurityexception.checkaccess.threadgroup", "Exce\u00E7\u00E3o de Seguran\u00E7a: grupo de threads: {0}"},
            {"appletsecurityexception.checkexit", "Exce\u00E7\u00E3o de Seguran\u00E7a: sa\u00EDda: {0}"},
            {"appletsecurityexception.checkexec", "Exce\u00E7\u00E3o de Seguran\u00E7a: exec.: {0}"},
            {"appletsecurityexception.checklink", "Exce\u00E7\u00E3o de Seguran\u00E7a: link: {0}"},
            {"appletsecurityexception.checkpropsaccess", "Exce\u00E7\u00E3o de Seguran\u00E7a: propriedades"},
            {"appletsecurityexception.checkpropsaccess.key", "Exce\u00E7\u00E3o de Seguran\u00E7a: acesso \u00E0s propriedades {0}"},
            {"appletsecurityexception.checkread.exception1", "Exce\u00E7\u00E3o de Seguran\u00E7a: {0}, {1}"},
            {"appletsecurityexception.checkread.exception2", "Exce\u00E7\u00E3o de Seguran\u00E7a: file.read: {0}"},
            {"appletsecurityexception.checkread", "Exce\u00E7\u00E3o de Seguran\u00E7a: file.read: {0} == {1}"},
            {"appletsecurityexception.checkwrite.exception", "Exce\u00E7\u00E3o de Seguran\u00E7a: {0}, {1}"},
            {"appletsecurityexception.checkwrite", "Exce\u00E7\u00E3o de Seguran\u00E7a: file.write: {0} == {1}"},
            {"appletsecurityexception.checkread.fd", "Exce\u00E7\u00E3o de Seguran\u00E7a: fd.read"},
            {"appletsecurityexception.checkwrite.fd", "Exce\u00E7\u00E3o de Seguran\u00E7a: fd.write"},
            {"appletsecurityexception.checklisten", "Exce\u00E7\u00E3o de Seguran\u00E7a: socket.listen: {0}"},
            {"appletsecurityexception.checkaccept", "Exce\u00E7\u00E3o de Seguran\u00E7a: socket.accept: {0}:{1}"},
            {"appletsecurityexception.checkconnect.networknone", "Exce\u00E7\u00E3o de Seguran\u00E7a: socket.connect: {0}->{1}"},
            {"appletsecurityexception.checkconnect.networkhost1", "Exce\u00E7\u00E3o de Seguran\u00E7a: N\u00E3o foi poss\u00EDvel estabelecer conex\u00E3o com {0} com a origem de {1}."},
            {"appletsecurityexception.checkconnect.networkhost2", "Exce\u00E7\u00E3o de Seguran\u00E7a: N\u00E3o foi poss\u00EDvel resolver o IP para o host {0} ou para {1}. "},
            {"appletsecurityexception.checkconnect.networkhost3", "Exce\u00E7\u00E3o de Seguran\u00E7a: N\u00E3o foi poss\u00EDvel resolver o IP para o host {0}. Consulte a propriedade trustProxy."},
            {"appletsecurityexception.checkconnect", "Exce\u00E7\u00E3o de Seguran\u00E7a: conectar: {0}->{1}"},
            {"appletsecurityexception.checkpackageaccess", "Exce\u00E7\u00E3o de Seguran\u00E7a: n\u00E3o \u00E9 poss\u00EDvel acessar o pacote: {0}"},
            {"appletsecurityexception.checkpackagedefinition", "Exce\u00E7\u00E3o de Seguran\u00E7a: n\u00E3o \u00E9 poss\u00EDvel definir o pacote: {0}"},
            {"appletsecurityexception.cannotsetfactory", "Exce\u00E7\u00E3o de Seguran\u00E7a: n\u00E3o \u00E9 poss\u00EDvel definir o factory"},
            {"appletsecurityexception.checkmemberaccess", "Exce\u00E7\u00E3o de Seguran\u00E7a: verificar acesso do membro"},
            {"appletsecurityexception.checkgetprintjob", "Exce\u00E7\u00E3o de Seguran\u00E7a: getPrintJob"},
            {"appletsecurityexception.checksystemclipboardaccess", "Exce\u00E7\u00E3o de Seguran\u00E7a: getSystemClipboard"},
            {"appletsecurityexception.checkawteventqueueaccess", "Exce\u00E7\u00E3o de Seguran\u00E7a: getEventQueue"},
            {"appletsecurityexception.checksecurityaccess", "Exce\u00E7\u00E3o de Seguran\u00E7a: opera\u00E7\u00E3o de seguran\u00E7a: {0}"},
            {"appletsecurityexception.getsecuritycontext.unknown", "tipo de carregador de classe desconhecido. n\u00E3o \u00E9 poss\u00EDvel verificar getContext"},
            {"appletsecurityexception.checkread.unknown", "tipo de carregador de classe desconhecido. n\u00E3o \u00E9 poss\u00EDvel verificar a leitura {0}"},
            {"appletsecurityexception.checkconnect.unknown", "tipo de carregador de classe desconhecido. n\u00E3o \u00E9 poss\u00EDvel verificar a conex\u00E3o"},
        };

        return temp;
    }
}
