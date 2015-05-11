package com.coolerfall;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Generate data access object.
 *
 * @author Vincent Cheung
 * @since  Apr. 23, 2015
 */
public class Generator {
	public static void main(String args[]) throws Exception {
		Schema schema = new Schema(1, "com.coolerfall.models.db.dao");
		Entity melodyInfo = schema.addEntity("MelodyInfo");
		melodyInfo.setTableName("melody_info");

		melodyInfo.addIdProperty().primaryKey().index();
		melodyInfo.addStringProperty("playListName").columnName("pl_name");
		melodyInfo.addStringProperty("album").columnName("album");
		melodyInfo.addStringProperty("title").columnName("title");
		melodyInfo.addStringProperty("artist").columnName("artist");
		melodyInfo.addStringProperty("genre").columnName("genre");
		melodyInfo.addStringProperty("comment").columnName("comment");
		melodyInfo.addStringProperty("filePath").columnName("file_path");
		melodyInfo.addIntProperty("duration").columnName("duration");
		melodyInfo.addIntProperty("sampleRate").columnName("sample_rate");
		melodyInfo.addIntProperty("channels").columnName("channels");
		melodyInfo.addIntProperty("bitRate").columnName("bit_rate");
		melodyInfo.addIntProperty("bps").columnName("bps");
		melodyInfo.addIntProperty("year").columnName("year");
		melodyInfo.addIntProperty("track").columnName("track");

		/* generate all dao */
		new DaoGenerator().generateAll(schema, args[0]);
	}
}
