package com.vitaliidotsenko.jvm.examples;

import io.activej.http.AsyncServlet;
import io.activej.http.HttpResponse;
import io.activej.inject.annotation.Provides;
import io.activej.launcher.Launcher;
import io.activej.launchers.http.HttpServerLauncher;
import io.activej.promise.Promise;

public class WebApp extends HttpServerLauncher {

	@Provides
	AsyncServlet servlet() {
		return request -> HttpResponse.ok200()
			.withPlainText("Hello, World!")
			.toPromise();
	}

	public static void main(String[] args) throws Exception {
		Launcher launcher = new WebApp();
		launcher.launch(args);
	}
}
