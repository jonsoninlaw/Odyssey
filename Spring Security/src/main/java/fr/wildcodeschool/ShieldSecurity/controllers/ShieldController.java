package fr.wildcodeschool.ShieldSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD.";
    }

    @GetMapping("/avengers/assemble")
    public String assemble() {
        return "Welcome to the SHIELD.";
    }

    @GetMapping("/secret-bases")
    public String secret() {
        return "<ul>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/amsterdam\">Amsterdam</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/barcelone\">Barcelone</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/berlin\">Berlin</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/bruxelles\">Bruxelles</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/bucharest\">Bucarest</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/budapest\">Budapest</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/dublin\">Dublin</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/lisbonne\">Lisbonne</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/londres\">Londres</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/madrid\">Madrid</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/milan\">Milan</a>\n" +
                "</li>\n" +
                "</ul>" + "<ul>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/biarritz\">Biarritz</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/bordeaux\">Bordeaux</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/la-loupe\">La Loupe \uD83C\uDF32</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/lille\">Lille</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/lyon\">Lyon</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/marseille\">Marseille</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/nantes\">Nantes</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/orleans\">Orléans</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/paris\">Paris</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/reims\">Reims</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/strasbourg\">Strasbourg</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/toulouse\">Toulouse</a>\n" +
                "</li>\n" +
                "<li>\n" +
                "<a href=\"/fr-FR/campus/tours\">Tours</a>\n" +
                "</li>\n" +
                "</ul>";
    }
}