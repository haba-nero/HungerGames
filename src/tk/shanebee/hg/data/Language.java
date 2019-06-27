package tk.shanebee.hg.data;

import tk.shanebee.hg.HG;
import tk.shanebee.hg.Util;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Language {

    private FileConfiguration lang = null;
    private File customLangFile = null;
    private final HG plugin;

    public String prefix;
    public String player_joined_game;
    public String player_left_game;
    public String game_started;
    public String game_join;
    public String game_countdown;
    public String game_almost_over;
    public String game_ending_minsec;
    public String game_ending_min;
    public String game_ending_sec;
    public String game_border_closing;
    public String game_chest_refill;
    public String players_to_start;
    public String arena_not_ready;
    public String arena_spectate;
    public String game_full;
    public String player_won;
    public String winning_amount;
    public String kit_join_header;
    public String kit_join_footer;
    public String kit_join_msg;
    public String kit_join_avail;
    public String kit_no_perm;
    public String kit_doesnt_exist;
    public String players_alive;
    public String players_alive_num;
    public String scoreboard_title;
    public String scoreboard_arena;
    public String team_invite_1;
    public String team_invite_2;
    public String team_invite_3;
    public String team_invite_4;
    public String joined_team;
    public String chest_drop_1;
    public String chest_drop_2;
    public String compass_nearest_player;
    public String roam_game_started;
    public String roam_time;
    public String roam_finished;
    public String death_fallen;
    public String death_explosion;
    public String death_custom;
    public String death_fall;
    public String death_falling_block;
    public String death_fire;
    public String death_projectile;
    public String death_lava;
    public String death_magic;
    public String death_suicide;
    public String death_other_cause;
    public String death_player;
    public String death_zombie;
    public String death_skeleton;
    public String death_spider;
    public String death_drowned;
    public String death_trident;
    public String death_stray;
    public String death_other_entity;
    public String cmd_spawn_same;
    public String cmd_spawn_set;
    public String cmd_base_noperm;
    public String cmd_base_nogame;
    public String cmd_base_noregion;
    public String cmd_base_wrongusage;
    public String cmd_create_need_selection;
    public String cmd_create_divisible_1;
    public String cmd_create_divisible_2;
    public String cmd_create_minmax;
    public String cmd_create_created;
    public String cmd_delete_attempt;
    public String cmd_delete_kicking;
    public String cmd_delete_deleted;
    public String cmd_delete_failed;
    public String cmd_delete_noexist;
    public String cmd_join_in_game;
    public String cmd_kit_no_change;
    public String cmd_leave_left;
    public String cmd_reload_attempt;
    public String cmd_reload_reloaded_arena;
    public String cmd_reload_reloaded_kit;
    public String cmd_reload_reloaded_items;
    public String cmd_reload_reloaded_config;
    public String cmd_reload_reloaded_success;
    public String cmd_exit_set;
    public String cmd_lobbywall_set;
    public String cmd_lobbywall_notcorrect;
    public String cmd_lobbywall_format;
    public String cmd_start_starting;
    public String cmd_stop_all;
    public String cmd_stop_arena;
    public String cmd_stop_noexist;
    public String cmd_team_not_avail;
    public String cmd_team_only_leader;
    public String cmd_team_on_team;
    public String cmd_team_max;
    public String cmd_team_invited;
    public String cmd_team_wrong;
    public String cmd_team_no_pend;
    public String cmd_team_joined;
    public String cmd_toggle_locked;
    public String cmd_toggle_unlocked;
    public String cmd_handler_nokit;
    public String cmd_handler_nocmd;
    public String cmd_handler_playing;
    public String cmd_chest_refill;
    public String cmd_border_size;
    public String cmd_border_center;
    public String cmd_border_timer;
    public String listener_not_running;
    public String listener_no_edit_block;
    public String listener_no_interact;
    public String track_nearest;
    public String track_no_near;
    public String track_empty;
    public String track_bar;
    public String track_new1;
    public String track_new2;
    public String listener_sign_click_hand;
    public String bossbar;




    public Language(HG plugin) {
        this.plugin = plugin;
        loadLangFile();
    }

    private void loadLangFile() {
        if (customLangFile == null) {
            customLangFile = new File(plugin.getDataFolder(), "language.yml");
        }
        if (!customLangFile.exists()) {
            plugin.saveResource("language.yml", false);
            lang = YamlConfiguration.loadConfiguration(customLangFile);
            Util.log("&7New language.yml created");
        } else {
            lang = YamlConfiguration.loadConfiguration(customLangFile);
        }
        updateLang(lang, customLangFile);
        loadLang();
        Util.log("&7language.yml loaded");
    }

    private void loadLang() {
        prefix = lang.getString("prefix");
        player_joined_game = lang.getString("player-joined-game");
        player_left_game = lang.getString("player-left-game");
        game_started = lang.getString("game-started");
        game_join = lang.getString("game-join");
        game_countdown = lang.getString("game-countdown");
        game_almost_over = lang.getString("game-almost-over");
        game_ending_minsec = lang.getString("game-ending-minsec");
        game_ending_min = lang.getString("game-ending-min");
        game_ending_sec = lang.getString("game-ending-sec");
        game_border_closing = lang.getString("game-border-closing");

        players_to_start = lang.getString("players-to-start");
        arena_not_ready = lang.getString("arena-not-ready");
        arena_spectate = lang.getString("arena-spectate");
        game_full = lang.getString("game-full");
        player_won = lang.getString("player-won");

        kit_join_header = lang.getString("kit-join-header");
        kit_join_footer = lang.getString("kit-join-footer");
        kit_join_msg = lang.getString("kit-join-msg");
        kit_join_avail = lang.getString("kit-join-available");
        kit_no_perm = lang.getString("kit-no-perm");
        kit_doesnt_exist = lang.getString("kit-doesnt-exist");
        winning_amount = lang.getString("winning-amount");

        scoreboard_title = lang.getString("scoreboard-title");
        scoreboard_arena = lang.getString("scoreboard-arena");
        players_alive = lang.getString("players-alive");
        players_alive_num = lang.getString("players-alive-num");
        team_invite_1 = lang.getString("team-invite-1");
        team_invite_2 = lang.getString("team-invite-2");
        team_invite_3 = lang.getString("team-invite-3");
        team_invite_4 = lang.getString("team-invite-4");
        joined_team = lang.getString("joined-team");

        chest_drop_1 = lang.getString("chest-drop-1");
        chest_drop_2 = lang.getString("chest-drop-2");

        compass_nearest_player = lang.getString("compass-nearest-player");

        roam_game_started = lang.getString("roam-game-started");
        roam_time = lang.getString("roam-time");
        roam_finished = lang.getString("roam-finished");

        death_fallen = lang.getString("death-fallen");
        death_explosion = lang.getString("death-explosion");
        death_custom = lang.getString("death-custom");
        death_fall = lang.getString("death-fall");
        death_falling_block = lang.getString("death-falling-block");
        death_fire = lang.getString("death-fire");
        death_projectile = lang.getString("death-projectile");
        death_lava = lang.getString("death-lava");
        death_magic = lang.getString("death-magic");
        death_suicide = lang.getString("death-suicide");
        death_other_cause = lang.getString("death-other-cause");
        death_player = lang.getString("death-player");
        death_zombie = lang.getString("death-zombie");
        death_skeleton = lang.getString("death-skeleton");
        death_spider = lang.getString("death-spider");
        death_stray = lang.getString("death-stray");
        death_drowned = lang.getString("death-drowned");
        death_trident = lang.getString("death-trident");
        death_other_entity = lang.getString("death-other-entity");

        cmd_spawn_same = lang.getString("cmd-spawn-same");
        cmd_spawn_set = lang.getString("cmd-spawn-set");
        cmd_base_noperm = lang.getString("cmd-base-noperm");
        cmd_base_nogame = lang.getString("cmd-base-nogame");
        cmd_base_noregion = lang.getString("cmd-base-noregion");
        cmd_base_wrongusage = lang.getString("cmd-base-wrongusage");
        cmd_create_need_selection = lang.getString("cmd-create-need-selection");
        cmd_create_divisible_1 = lang.getString("cmd-create-divisible-1");
        cmd_create_divisible_2 = lang.getString("cmd-create-divisible-2");
        cmd_create_minmax = lang.getString("cmd-create-minmax");
        cmd_create_created = lang.getString("cmd-create-created");
        cmd_delete_attempt = lang.getString("cmd-delete-attempt");
        cmd_delete_kicking = lang.getString("cmd-delete-kicking");
        cmd_delete_deleted = lang.getString("cmd-delete-deleted");
        cmd_delete_failed = lang.getString("cmd-delete-failed");
        cmd_delete_noexist = lang.getString("cmd-delete-noexist");
        cmd_join_in_game = lang.getString("cmd-join-in-game");
        cmd_kit_no_change = lang.getString("cmd-kit-no-change");
        cmd_leave_left = lang.getString("cmd-leave-left");
        cmd_reload_attempt = lang.getString("cmd-reload-attempt");
        cmd_reload_reloaded_arena = lang.getString("cmd-reload-reloaded-arena");
        cmd_reload_reloaded_config = lang.getString("cmd-reload-reloaded-config");
        cmd_reload_reloaded_items = lang.getString("cmd-reload-reloaded-items");
        cmd_reload_reloaded_kit = lang.getString("cmd-reload-reloaded-kit");
        cmd_reload_reloaded_success = lang.getString("cmd-reload-reloaded-success");
        cmd_exit_set = lang.getString("cmd-exit-set");
        cmd_lobbywall_set = lang.getString("cmd-lobbywall-set");
        cmd_lobbywall_notcorrect = lang.getString("cmd-lobbywall-notcorrect");
        cmd_lobbywall_format = lang.getString("cmd-lobbywall-format");
        cmd_start_starting = lang.getString("cmd-start-starting");
        cmd_stop_all = lang.getString("cmd-stop-all");
        cmd_stop_arena = lang.getString("cmd-stop-arena");
        cmd_stop_noexist = lang.getString("cmd-stop-noexist");
        cmd_team_not_avail = lang.getString("cmd-team-not-avail");
        cmd_team_only_leader = lang.getString("cmd-team-only-leader");
        cmd_team_on_team = lang.getString("cmd-team-on-team");
        cmd_team_max = lang.getString("cmd-team-max");
        cmd_team_invited = lang.getString("cmd-team-invited");
        cmd_team_wrong = lang.getString("cmd-team-wrong");
        cmd_team_no_pend = lang.getString("cmd-team-no-pending");
        cmd_team_joined = lang.getString("cmd-team-joined");
        cmd_toggle_unlocked = lang.getString("cmd-toggle-unlocked");
        cmd_toggle_locked = lang.getString("cmd-toggle-locked");
        cmd_handler_nokit = lang.getString("cmd-handler-nokit");
        cmd_handler_nocmd = lang.getString("cmd-handler-nocmd");
        cmd_handler_playing = lang.getString("cmd-handler-playing");
        listener_not_running = lang.getString("listener-not-running");
        listener_no_edit_block = lang.getString("listener-no-edit-block");
        listener_no_interact = lang.getString("listener-no-interact");
        track_nearest = lang.getString("track-nearest");
        track_no_near = lang.getString("track-no-near");
        track_empty = lang.getString("track-empty");
        track_bar = lang.getString("track-bar");
        track_new1 = lang.getString("track-new1");
        track_new2 = lang.getString("track-new2");
        listener_sign_click_hand = lang.getString("listener-sign-click-hand");
        bossbar = lang.getString("game-bossbar");

        game_chest_refill = lang.getString("game-chests-refill");
        cmd_chest_refill = lang.getString("cmd-chestrefill-set");
        cmd_border_center = lang.getString("cmd-border-center");
        cmd_border_size = lang.getString("cmd-border-size");
        cmd_border_timer = lang.getString("cmd-border-timer");
    }

    private void updateLang(FileConfiguration config, File file){
        if (!config.isSet("game-bossbar")) {
            config.set("game-bossbar", "&6&lGame Ends In: &b&l<min> &7min &b&l<sec> &7sec");
            config.set("players-alive", "&d&lTributes:");
            config.set("players-alive-num", "&e<num> alive");
            config.set("scoreboard-arena", "&a&lArena: &b");
        }
        if (!config.isSet("game-border-closing")) {
            config.set("game-border-closing", "&6The border is coming, you have <seconds> seconds to get to the center of the arena!");
        }
        if (!config.isSet("game-chests-refill")) {
            config.set("game-chests-refill", "&6Chests have been refilled");
            config.set("cmd-chestrefill-set", "&6Chest refill for &b<arena> &6has been set to &b<sec> seconds");
        }
        if (!config.isSet("cmd-border-size")) {
            config.set("cmd-border-size", "&6Border size for &b<arena> &6has been set to &b<size>");
            config.set("cmd-border-center", "&6Border center for &b<arena> &6has been set at your location");
            config.set("cmd-border-timer", "&6Border time for &b<arena> &6has been set to start at remaining &b<start> seconds &6and stop at &b<end> seconds");
        }
        if (!config.isSet("arena-spectate")) {
            config.set("arena-spectate", "&6You can spectate this arena by running &3/hg spectate <arena>");
        }
        saveConfig();
    }

    private void saveConfig() {
        try {
            lang.save(customLangFile);
            loadLang();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
