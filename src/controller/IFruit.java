package controller;

import java.io.IOException;

public interface IFruit {
	public void readDir(String path) throws IOException;
	public void readFile(String path, String nome) throws IOException;
}
