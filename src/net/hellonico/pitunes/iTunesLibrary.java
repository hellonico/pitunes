/**
 * ##library.name##
 * ##library.sentence##
 * ##library.url##
 *
 * Copyright ##copyright## ##author##
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 * 
 * @author      ##author##
 * @modified    ##date##
 * @version     ##library.prettyVersion## (##library.version##)
 */

package net.hellonico.pitunes;


import nl.escay.javaitunesapi.itunes.ITunesSuite;
import nl.escay.javaitunesapi.itunes.Source;
import processing.core.PApplet;

/**
 * This is a template class and can be used to start a new processing library or tool.
 * Make sure you rename this class as well as the name of the example package 'template' 
 * to your own library or tool naming convention.
 * 
 * @example Hello 
 * 
 * (the tag @example followed by the name of an example included in folder 'examples' will
 * automatically include the example in the javadoc.)
 *
 */

public class iTunesLibrary {

	public final static String VERSION = "##library.prettyVersion##";

	private ITunesSuite iTunes;

	private Source source;

	public iTunesLibrary() {
		iTunes = new ITunesSuite();
		iTunes.start();
		source = new Source();
	}
	
	public void play() {iTunes.play();}
	public void pause() {iTunes.pause();}
	public void toggle() {iTunes.playPause();}
	public void next() {iTunes.nextTrack();}
	public void previous() {iTunes.previousTrack();}
	
	public static String version() {
		return VERSION;
	}
}

