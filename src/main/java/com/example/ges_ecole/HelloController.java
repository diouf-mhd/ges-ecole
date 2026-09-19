package com.example.ges_ecole;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return """
            <!DOCTYPE html>
            <html lang="fr">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>GesEcole - Dashboard CI/CD</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
                <style>
                    body {
                        background: linear-gradient(135deg, #0f172a 0%, #1e293b 100%);
                        color: #f8fafc;
                        min-height: 100vh;
                        display: flex;
                        align-items: center;
                        justify-content: center;
                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                    }
                    .glass-card {
                        background: rgba(30, 41, 59, 0.75);
                        backdrop-filter: blur(12px);
                        border: 1px solid rgba(255, 255, 255, 0.125);
                        border-radius: 20px;
                        box-shadow: 0 20px 40px rgba(0, 0, 0, 0.4);
                    }
                    .badge-success-custom {
                        background-color: #10b981;
                        color: #ffffff;
                        padding: 8px 16px;
                        border-radius: 50px;
                        font-size: 0.9rem;
                    }
                    .avatar-box {
                        width: 48px;
                        height: 48px;
                        border-radius: 12px;
                        background: rgba(59, 130, 246, 0.2);
                        display: flex;
                        align-items: center;
                        justify-content: center;
                        color: #60a5fa;
                        font-size: 1.4rem;
                    }
                </style>
            </head>
            <body>
                <div class="container py-5">
                    <div class="row justify-content-center">
                        <div class="col-lg-8">
                            <div class="glass-card p-4 p-md-5">
                                <div class="text-center mb-4">
                                    <span class="badge badge-success-custom mb-3">
                                        <i class="bi bi-check-circle-fill me-2"></i>Déploiement CI/CD Réussi
                                    </span>
                                    <h1 class="fw-bold text-white mb-2">Application GesEcole</h1>
                                    <p class="text-secondary mb-0">Pipeline d'Intégration et Déploiement Continus (TP2)</p>
                                </div>

                                <hr class="border-secondary opacity-25 my-4">

                                <div class="p-3 rounded-3 bg-dark bg-opacity-50 mb-3 border border-secondary border-opacity-10">
                                    <div class="d-flex align-items-center">
                                        <div class="avatar-box me-3">
                                            <i class="bi bi-building"></i>
                                        </div>
                                        <div>
                                            <small class="text-secondary d-block">Établissement</small>
                                            <strong class="text-white fs-5">Institut Polytechnique de Dakar (IPD)</strong>
                                        </div>
                                    </div>
                                </div>

                                <div class="row g-3 mb-4">
                                    <div class="col-md-6">
                                        <div class="d-flex align-items-center p-3 rounded-3 bg-dark bg-opacity-50 border border-secondary border-opacity-10">
                                            <div class="avatar-box me-3">
                                                <i class="bi bi-people-fill"></i>
                                            </div>
                                            <div>
                                                <small class="text-secondary d-block">Réalisé par</small>
                                                <strong class="text-white">Fatima Diop & Moussa Diouf</strong>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="d-flex align-items-center p-3 rounded-3 bg-dark bg-opacity-50 border border-secondary border-opacity-10">
                                            <div class="avatar-box me-3">
                                                <i class="bi bi-person-badge-fill"></i>
                                            </div>
                                            <div>
                                                <small class="text-secondary d-block">Encadré par</small>
                                                <strong class="text-white">Mr. LY</strong>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="border border-secondary border-opacity-25 rounded-3 p-3 bg-black bg-opacity-25">
                                    <h6 class="text-uppercase text-secondary fs-7 fw-bold mb-3">Environnement Technique</h6>
                                    <div class="row g-2 text-sm">
                                        <div class="col-6 col-md-3">
                                            <span class="text-secondary d-block">Serveur VM:</span>
                                            <small class="text-light fw-semibold">192.168.146.134</small>
                                        </div>
                                        <div class="col-6 col-md-3">
                                            <span class="text-secondary d-block">Framework:</span>
                                            <small class="text-light fw-semibold">Spring Boot 3.2.3</small>
                                        </div>
                                        <div class="col-6 col-md-3">
                                            <span class="text-secondary d-block">Conteneur:</span>
                                            <small class="text-light fw-semibold">Docker</small>
                                        </div>
                                        <div class="col-6 col-md-3">
                                            <span class="text-secondary d-block">Base BDD:</span>
                                            <small class="text-light fw-semibold">H2 (In-Memory)</small>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </body>
            </html>
            """;
    }
}