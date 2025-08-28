package br.com.carstore.servlet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String carName = request.getParameter("car-name");
        String nome = request.getParameter("seu-nome");

        //System.out.println(carName);
        Map<String, String> respostaJson = new HashMap<>();
        respostaJson.put("nome_carro", carName);
        respostaJson.put("seu_nome", nome);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String resposta = gson.toJson(respostaJson);

        request.setAttribute("response", resposta);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

}